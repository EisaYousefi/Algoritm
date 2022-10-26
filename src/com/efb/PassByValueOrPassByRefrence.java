package com.efb;

public class PassByValueOrPassByRefrence {

    //معرفی کردیم callee متدی که توی توضیحات با عنوان
//متدی است که فراخوانی خواهد شد
    private void incrementCount(int count) {
        count = count + 1;
        System.out.println("formal parameter: " + count);
    }

    public static void main(String[] args) {
        PassByValueOrPassByRefrence pas = new PassByValueOrPassByRefrence();
        int count = 0;

        //معرفی کردیم caller رو صدا میکنیم با عنوان incrementCount جایی که متد
        // مقداری است که به عنوان ورودی به متد ارسالش میکنیم count
        //معرفی شد actual parameter این مقدار توی توضیحات با عنوان

        pas.incrementCount(count);
        System.out.println("actual parameter: "+count);


    }

}



