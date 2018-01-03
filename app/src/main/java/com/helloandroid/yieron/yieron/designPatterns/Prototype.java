package com.helloandroid.yieron.yieron.designPatterns;

/**
 * 作者：yindong on 2017/2/24.
 * 邮箱：yieron@163.com
 * 版本：v1.0
 */
public class Prototype {

    /**
     * 原型模式：
     * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
     *
     * 优点：

     原型模式是在内存二进制流的拷贝，
     要比直接 new 一个对象性能好很多，
     特别是要在一个循环体内产生大量的对象时，
     原型模式可以更好地体现其优点。

     缺点：
     这既是它的优点也是缺点，
     直接在内存中拷贝，构造函数是不会执行的，
     在实际开发当中应该注意这个潜在的问题。
     优点就是减少了约束，缺点也是减少了约束，需要大家在实际应用时考虑。
     */
    //Intent中使用了原型模式


}