class Prime {
    
    public void checkPrime(int... vars){
        for(int num : vars){
            boolean flag = true;
            if(num<2) flag=false;
            for(int i=2 ; i<num ; i++){
                if( num%i == 0)
                    flag=false;
            }
            System.out.print(flag==true?num+" ":"");
        }
        System.out.println();
    }
}
