package com.ssm.game;

import com.ssm.interceptor.Interceptor;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class ProxyBeanFactory {

    public  Object getBean(Object obj, Interceptor interceptor) {
        //ProxyBeanUtil proxyBeanUtil = new ProxyBeanUtil(obj,interceptor);
        return  ProxyBeanUtil.getBean(obj, interceptor);
    }
}
    class ProxyBeanUtil implements InvocationHandler {
        //保存被代理对象
        private Object object;
        //保存拦截器
        private Interceptor interceptors;

        public  ProxyBeanUtil(Object object,Interceptor interceptors){
            this.object =object;
            this.interceptors = interceptors;
        }

        public static Object getBean(Object obj, Interceptor interceptor) {
            //保存代理对象，将拦截器也保存在代理中
            Object retuObj=null;
            retuObj =  Proxy.newProxyInstance(obj.getClass().getClassLoader() , obj.getClass().getInterfaces(), new ProxyBeanUtil(obj,interceptor));
            //retuObj =  Proxy.newProxyInstance(obj.getClass().getClassLoader() , obj.getClass().getInterfaces(), this);
            //当方法为非静态时，可直接采用this，但是此时需要在外部定义好实现代理逻辑方法的当前对象，即上文注释
            return retuObj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) {
            Object reobj = null;
            boolean exceptionFlag = false;
            //代理保存在原代理对象中
            interceptors.before(object);
            try {
                reobj = method.invoke(object, args);
            } catch (Exception ex) {
                exceptionFlag = true;
            } finally {
                interceptors.after(object);
            }
            if (exceptionFlag) {
                interceptors.afterThrowing(object);
            } else {
                interceptors.afterReturning(object);
            }
            return reobj;
        }
    }