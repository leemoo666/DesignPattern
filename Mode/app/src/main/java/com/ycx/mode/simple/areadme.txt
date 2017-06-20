简单工厂模式:建立一个工厂类(SenderFactory),对实现了统一接口(Sender)的一
些类(MailSender,SmsSender)进行实例创建,然后用这些实例去调用相应的方法

问题:如果有新的产品,就需要对工厂类进行修改,违背了闭包原则
