package com.te.dtolayer;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MiniStatement {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="S_No")
	private int id;
    @Column(name="Account_Number")
	private long accountNumber;
    @Column(name="Date")
	private LocalDate date;
    @Column(name="Deposit")
	private double deposit;
    @Column(name="Withdraw")
	private double withdraw;
    @Column(name="Current_Balance")
	private double currentBalance;
    @Column(name="Time")
    private LocalTime time;
    
	@Override
	public String toString() {
		return "[ "+" accountNumber:" + accountNumber + ", date:" + date + ", deposit:"
				+ deposit + ", withdraw:" + withdraw + ", currentBalance:" + currentBalance + ", time:" + time + "]";
	}
	public MiniStatement(int id, long accountNumber, LocalDate date, double deposit, double withdraw,
			double currentBalance, LocalTime time) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.date = date;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.currentBalance = currentBalance;
		this.time = time;
	}
	public MiniStatement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
    
}
