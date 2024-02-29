package org.company.fundraisedemo.payment;

import org.company.fundraisedemo.donar.DonorExceptions;
import org.company.fundraisedemo.post.PostExceptions;

public interface PaymentService {
     String transaction(TransactionDto transaction) throws PaymentExceptions,DonorExceptions, PostExceptions;
}
