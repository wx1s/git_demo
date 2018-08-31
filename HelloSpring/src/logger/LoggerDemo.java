package logger;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LoggerDemo {
	private static final Logger log=Logger.getLogger(LoggerDemo.class);
	//前置增强的方法
	public void before(JoinPoint jp){
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法入参："+Arrays.toString(jp.getArgs()));
	}
	//后置增强的方法
	public void afterReturning(JoinPoint jp,Object result){
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法返回值："+result);
	}

}
