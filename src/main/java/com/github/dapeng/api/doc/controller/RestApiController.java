package com.github.dapeng.api.doc.controller;

import com.github.dapeng.openapi.utils.PostUtil;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Desc: RestApiController
 * post 请求示例
 * post  http://127.0.0.1:8700/rest/com.github.dapeng.soa.idgen.service.IDService/1.0.0/genId
 * parameter = {"body":{"request":{"bizTag":"suplier","step":1}}}
 * @author: maple.lei
 * @Date: 2018-01-24 9:25
 */
@RestController
@RequestMapping("rest")
public class RestApiController {
    @PostMapping(value = "{service}/{version}/{method}")
    public String rest(@PathVariable(value = "service") String service,
                       @PathVariable(value = "version") String version,
                       @PathVariable(value = "method") String method,
                       @RequestParam(value = "parameter") String parameter,
                       HttpServletRequest req) {

        return PostUtil.post(service, version, method, parameter, req);
    }

}
