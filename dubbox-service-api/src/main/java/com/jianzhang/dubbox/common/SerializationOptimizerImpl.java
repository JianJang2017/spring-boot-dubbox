package com.jianzhang.dubbox.common;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.jianzhang.student.model.QueryStudentRequest;
import com.jianzhang.student.model.QueryStudentResponse;
import com.jianzhang.student.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 序列化工具类
 * @author Jian Jang
 * @version 1.0 2017/11/19
 */
public class SerializationOptimizerImpl  implements SerializationOptimizer {
    @SuppressWarnings("rawtypes")
	public Collection<Class> getSerializableClasses() {
        //要让Kryo和FST完全发挥出高性能，最好将那些需要被序列化的类注册到dubbo系统中
        //然后在XML配置中添加：<dubbo:protocol name="dubbo" serialization="kryo" optimizer="com.jianzhang.dubbox.common.SerializationOptimizerImpl"/>
        List<Class> serializableClasses = new ArrayList<>();
        serializableClasses.add(QueryStudentResponse.class);
        serializableClasses.add(QueryStudentRequest.class);
        serializableClasses.add(Student.class);
        return serializableClasses;
    }
}
