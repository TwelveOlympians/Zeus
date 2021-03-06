package org.twelveolympians.zeus.user.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.twelveolympians.zeus.common.core.entity.vo.Result;

@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    public Result findById(@PathVariable long id) {
        return Result.success();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
    public Result deleteById(@PathVariable long id)  {
        return Result.success();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
    public Result update(@PathVariable long id) {
        return Result.success();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/{id}")
    public Result add(@PathVariable long id) {
        return Result.success();
    }

}