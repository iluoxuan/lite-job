### lite-job

### 需要点
* 支持不同的rpc任务调研
* 支持任务的cron，暂停，更新，触发一次
* 支持任务自定义参数
* 支持groovy 任务自动修改【etl同步类型】
* 支持任务分布式部署
* 简单的任务监控，邮件报警


### 设计方案
* 基于spring boot
* 基于quartz
* 任务调度和业务分离


### 两种设计方案
* 一种lite-job-client 监听zookeeper/redis 
* 一种通过rpc 服务端调用客户端


### 设计方案
* 通过client监听服务端更新zk信息 触发任务



### 模块分割
* client 第三方应用
```
  xxxxjob extends liteJob

```
* 添加@LiteJob 注解

* 扫描所有LiteJob的 实现 注册到zookeeper上，可以加上默认的注解配置quartz生成
* 最终以后修改的 存储到mysql/redis中；建议用mysql
* 客户端端 建议监听所有的任务触发机制【服务端暂定，更新】---》 【客户端监听触发变动 执行任务】
* 如何处理客户端实例多个部署【  】
* 可以配置是否 分布式部署 【多个分片 or 只是使用一个实例】
* etl任务在线编辑【 上传elt groovy实现到 服务端保存到 mysql以后 触发的时候 客户端拉取服务端最新的 groovy代码加载任务 】



### 服务端逻辑
* 加载db中所有已经存储的任务，更新到zookeeper；
* 提供http 接口 任务动态更新
* 提供web控制台界面
* 提供任务监控机制 【邮件报警】
*【第一期不提供任务分片】

