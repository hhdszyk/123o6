# ticketCube
## 早期设计，与框架代码不同，已弃用
- disign
主要是存放设计的文档和与项目设计相关的文档:
  - adr(dir):(architecture decision record),主要记录对于结构设计的想法和讨论、以及分析得到结果的过程
  - architecture:最终的架构设计
  - database:数据库设计
  - request:需求
      - f   
- docs:主要存放与项目具体设计无关的文档
  - projectArchitecture(.md):描述了整个项目文件的结构
  - meetingRecord:例行会议记录
- scripts：脚本文档
- src：
主要存放项目的各种代码
  - main:
    - java(源，根)
      - nju(company名)
          - ticketCubeCode(组织名)
            - Order
            - Ticket
            - User
            - Main: 其中的main方法是整个项目的入口
    - resources:(通常用来存放项目的配置文件，静态资源等等)
      - static:存放静态资源的文件夹
        - css:存放css文件
        - js:存放javascript文件
        - img:存放图片
        - font:存放字体
      - templates:存放html文件，页面布局、表格表单等
  - test:主要用于完成项目开发全过程中的的测试
    - java：测试代码
- pom.xml:记录了maven的配置
- ReadMe(.md):用于记录如何启动项目的信息