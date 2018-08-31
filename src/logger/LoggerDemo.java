package logger;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LoggerDemo {
	private static final Logger log=Logger.getLogger(LoggerDemo.class);
	//ǰ����ǿ�ķ���
	public void before(JoinPoint jp){
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"������������Σ�"+Arrays.toString(jp.getArgs()));
	}
	//������ǿ�ķ���
	public void afterReturning(JoinPoint jp,Object result){
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"��������������ֵ��"+result);
	}

}
