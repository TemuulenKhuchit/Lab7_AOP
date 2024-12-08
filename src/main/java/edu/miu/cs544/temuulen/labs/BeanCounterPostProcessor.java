package edu.miu.cs544.temuulen.labs;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanCounterPostProcessor implements BeanPostProcessor {
    private int beanCount = 0;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        beanCount++;
        return bean;
    }

    public int getBeanCount() {
        return beanCount;
    }
}
