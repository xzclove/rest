package com.rest.restapi.controller;

import com.rest.restapi.utils.query.QueryConstants;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lennylv on 2017-1-4.
 * TODO Http缓存、Cache、Rate-Limit、Hateoas、安全性（Header、Body）、Error、一致性(Accept/Content-Type、Action、ETag、Status)
 * https://zhuanlan.zhihu.com/p/20034107?columnSlug=prattle
 */
@RequestMapping(path = "/orders")
public class OrderController {

    /**
     * 通过username过滤用户
     * TODO ?embed=userVo.username
     *
     * @param
     * @return
     */

    @RequestMapping(path = "/{id}", params = {QueryConstants.EMBED}, method = RequestMethod.GET)
    public Object queryUserRelate(@PathVariable(value = "id") String id, @RequestParam(QueryConstants.EMBED) String embed) {
        return null;
    }

    /**
     * 通过username过滤用户
     * TODO ?fields=orderId,number
     *
     * @param fields
     * @return
     */

    @RequestMapping(params = {QueryConstants.FIELD}, method = RequestMethod.GET)
    public Object queryOrderFields(@RequestParam(QueryConstants.FIELD) String fields) {
        return null;
    }

    /**
     * 通过username过滤用户
     * TODO gzip压缩
     *
     * @param
     * @return
     */

    @RequestMapping(method = RequestMethod.GET)
    public Object queryOrderGzip() {
        return null;
    }
}
