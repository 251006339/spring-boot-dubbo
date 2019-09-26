package com.hxm.userservice;


import com.alibaba.dubbo.config.annotation.Reference;
import com.hxm.service.TicketService;
import org.springframework.stereotype.Service;


/**
 * @author XAIOHU
 * @date 2019/9/26 --16:45
 **/
@Service
public class UserService{

    @Reference
    TicketService  ticketservice;
public  void test(){

    String ticket = ticketservice.getTicket();
    System.out.println("调用远程服务+"+ticket);

}



}
