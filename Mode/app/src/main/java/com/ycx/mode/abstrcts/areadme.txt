简单工厂方法模式
一个抽象类产品(Sender),可以派生出多个具体产品类(MailSender,SmsSender)
一个抽象工厂类(Factory),可以派生出多个具体工厂类(MailFactory,SmsFactory)

但是每个具体的工厂类(MailFactory)只能创建一个具体的产品类实例(MailSender)



抽象工厂模式
多个抽象产品类(IUser,IDepartment),每个抽象产品类可以派生出多个具体产品类(
OracleUser,OracleDepartment,SQLUser,SQLDepartment)
一个抽象工厂类(IFactory),可以派生出多个具体工厂类(OracleFactory,SQLFactory)

