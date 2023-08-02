package cn.xuqg.springcloud.service.impl;

import cn.xuqg.springcloud.dao.PaymentDao;
import cn.xuqg.springcloud.entities.Payment;
import cn.xuqg.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
