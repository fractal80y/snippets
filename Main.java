Supplier<String> fn = ()-> {return (new Supplier<Boolean>(){
	    public Boolean get(){
	        if(java.time.LocalTime.now().toString().contains("1")) return true;
	        else return false;}
	}).get() ? "HAS A 1 IN THE TIME" : "DOESN'T HAVE A ONE IN THE TIME";}


 ((OriginalInterface) () -> System.out.println("Implements method functionality")).show();