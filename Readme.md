### 大话设计模式
#### 一、简单工厂模式
到底要实例化谁，将来会不会增加实例化的对象，应该考虑用一个单独的类来做这个创造
实例的过程，这就是工厂。   
解决的是对象的创建问题
#### 二、促销模式
面向对象的编程，并不是类越多越好，类的划分是为了封装，但分类的基础是抽象，具有相同属性和功能的对象的抽象集合才是类。   
策略模式:定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化，
不会影响到使用算法的客户。   
策略模式是一种定义一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，
只是实现不同，它可以以相同的方式调用所有的算法，减少了各种算法类与使用算法类之间的耦合。   
##### 策略模式的优点
1.策略模式的Strategy类层次为Context定义了一系列的可供重用的算法或行为。
继承有助于析取出这些算法中的公共功能。   
2.简化了单元测试，因为每个算法都有自己的类，可以通过自己的接口单独测试。
##### 策略模式就是用来封装算法的，但是实践中，我们发现可以用它来封装几乎任何类型的规则，只要在分析过程中听到需要在不同时间应用不同的业务规则，就可以考虑使用策略模式处理这种变化的可能性。
#### 三、单一职责原则
就一个类而言，应该仅有一个引起它变化的原因。   
如果一个类承担的职责过多，就等于把这些职责耦合在一起，一个职责的变化可能会削弱或者抑制这个类完成其他职责的能力。
这种耦合会导致脆弱的设计，当变化发生时，设计会遭受到意想不到的破坏。   
软件设计真正要做的许多内容，就是发现职责并把那些职责相互分离。   
判断是否应该分离出类：如果你能够想到多于一个的动机去改变一个类，那么这个类就具有多于一个的职责，就应该考虑类的职责分离。
例如：俄罗斯方块游戏，游戏逻辑的类和界面逻辑就需要分开。
#### 四、开放-封闭原则
开放-封闭原则，是说软件实体(类、模块、函数等)应该可以扩展，但是不可修改。   
##### 这个原则有两个特征，一个是对于扩展是开放的，一个是对于更改是封闭的。
这样面对需要的改变就可以保持相对稳定，从而使得系统可以在第一个版本以后不断推出新的版本。   
设计的时候，时刻要考虑，尽量让这个类足够好，写好就不要去修改了，如果新需求来，我们增加一些类就完事了，原来的代码能不动就不动。   
无论模块是多么的“封闭”，都会存在一些无法对之封闭的变化。既然不可能完全封闭，设计人员必须对于他设计的模块
应该对哪种变化封闭做出选择。他必须先猜测最有可能发生的变化种类，然后构造抽象来隔离那些变化。   
##### 面对需求，对程序的改动是通过增加代码进行的，而不是更改现有的代码。
#### 五、依赖倒转原则
抽象不应该依赖细节，细节应该依赖于抽象。   
##### 针对接口编程，不要对实现编程。
依赖倒转原则：
1.高层模块不应该依赖低层模块。两个都应该依赖抽象。
2.抽象不应该依赖细节。细节应该依赖抽象。
#### 里氏代换原则
##### 一个软件实体如果使用的是父类的话，那么一定适用于其子类，而且他察觉不出父类对象和子类对象的区别。
##### 也就是说，在软件里面，把父类都替换成它的子类，程序的行为没有变化，简单的说，子类型必须能够替换掉它们的父类型。
#### 六、装饰模式
##### 装饰模式(Decorator)，动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。




































