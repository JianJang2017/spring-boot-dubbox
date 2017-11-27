package com.jianzhang.student.dubbox.service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.jianzhang.student.model.QueryStudentRequest;
import com.jianzhang.student.model.QueryStudentResponse;

import javax.validation.constraints.Min;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @Description: 学生信息查询接口:Rest
 * @author Jian Jang
 * @version 1.0 2017/11/17
 */
@Path("restServices/users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface QueryStudentRestService {
    /**
     * 学生信息查询方法
     * @param queryStudentRequest
     * @return
     */
    @POST
    @Path("queryStudentRest")
    public QueryStudentResponse queryStudentRest(QueryStudentRequest queryStudentRequest);
    /**
     * 学生信息查询方法
     * http://localhost:8888/contentpath(详细参照配置文件（dubbox-provider.xml）)/restServices/users/1.json
     * http://localhost:8888/user/1.xml
     * @param queryStudentRequest
     * @return
     */
    @GET
    @Path("queryStudentRestByUserID")
    public QueryStudentResponse queryStudentRestByUserID(@Min(value=1L, message="User ID must be greater than 1")@QueryParam("id")Long userId);
}
