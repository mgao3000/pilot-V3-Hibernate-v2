package com.devmountain.training.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "account")
public class Account {
    public  Account() {}
    public  Account(String accountType, BigDecimal balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    @Id
    //@SequenceGenerator(name="account_id_generator", sequenceName="account_id_seq", allocationSize = 1)
    //@GeneratedValue(strategy=SEQUENCE, generator="account_id_generator")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name ="account_type")
    private String accountType;

    @Column(name = "balance")
    private BigDecimal balance;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                account.balance.compareTo(balance) == 0 &&
                accountType.equals(account.accountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountType, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                '}';
    }

    //    @Override
//    public String toString() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        String str = null;
//        try {
//            str = objectMapper.writeValueAsString(this);
//        }
//        catch(JsonProcessingException jpe) {
//            jpe.printStackTrace();
//        }
//
//        return str;
//    }
}
