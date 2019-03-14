/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxswingapplication1;

/**
 *
 * @author Hp
 */
class User {
    private int BASE_PRICE;
    private String USER_NAME,BOOK_NAME,DESCRIPTION;
    public User(String USER_NAME,String BOOK_NAME,String DESCRIPTION,int BASE_PRICE){
    this.BASE_PRICE=BASE_PRICE;
    this.BOOK_NAME=BOOK_NAME;
    this.USER_NAME=USER_NAME;
    this.DESCRIPTION=DESCRIPTION;
    }
    public int getBASE_PRICE(){
        return BASE_PRICE;
    }
    public String getUSER_NAME(){
        return USER_NAME;
    }
    public String getBOOK_NAME(){
        return BOOK_NAME;
    }
    public String getDESCRIPTION(){
        return DESCRIPTION;
    }
  }
    
    

