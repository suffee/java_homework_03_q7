package homework_3_q7;

public class Temperature {
	//instance varible
	private   double temperatureValue;
	private   char      temperatureScale;  	
	
	//costructor
		Temperature(){
				this.temperatureValue=0;
				this.temperatureScale=0;
			}
	
		Temperature(double value,char scale){
				this.temperatureValue=value;
				this.temperatureScale=scale;
			}
	
	//accessor method
	public double getcelsius(){
		
				if((this.temperatureScale=='c')||(this.temperatureScale=='C')){
			
						return this.temperatureValue;
				}
				else{
						return (((this.temperatureValue-32)*5)/9);
				}
	}
	
	public double getFahrenheit(){
		
				if((this.temperatureScale=='f')||(this.temperatureScale=='F')){
	
						return this.temperatureValue;
				}
				else{
						return ((((this.temperatureValue)/5)*9)+32);
				}
	}
//mutator method
	public void setTemperatureValue(double temperature){
		
				this.temperatureValue=temperature;
			
				return;
	}
	public void setTemperatureScale(char scale){
	
		this.temperatureScale=scale;
	
		return;
	}
	public void setTemperature(char scale,double temperature){
	
		this.temperatureValue=temperature;
		this.temperatureScale=scale;
	
		return;
	}
	
	public boolean equals(Temperature another){
		
		if(this.temperatureScale==another.temperatureScale){
			
					if(this.temperatureValue==another.temperatureValue){
						return true;
					}	
					else{
						return false;
					}
			}
		else if((this.temperatureScale=='c')||(this.temperatureScale=='C')){
			
					if((((another.temperatureValue-32)*5)/9)==this.temperatureValue){
						return true;
					}
					else{
						return false;
					}
			}
		else{
				if((((another.temperatureValue)/5)*9+32)==this.temperatureValue){
					return true;
				}
				else{
					return false;
				}
		}
		}
	
	public boolean isGreater(Temperature another){
		
		if(this.temperatureScale==another.temperatureScale){
			
					if(this.temperatureValue>another.temperatureValue){
						return true;
					}	
					else{
						return false;
					}
			}
		else if((this.temperatureScale=='c')||(this.temperatureScale=='C')){
			
					if((((another.temperatureValue-32)*5)/9)>this.temperatureValue){
						return true;
					}
					else{
						return false;
					}
			}
		else{
				if((((another.temperatureValue)/5)*9+32)>this.temperatureValue){
					return true;
				}
				else{
					return false;
				}
		}
		}
			public boolean isLower(Temperature another){
		
		if(this.temperatureScale==another.temperatureScale){
			
					if(this.temperatureValue<another.temperatureValue){
						return true;
					}	
					else{
						return false;
					}
			}
		else if((this.temperatureScale=='c')||(this.temperatureScale=='C')){
			
					if((((another.temperatureValue-32)*5)/9)<this.temperatureValue){
						return true;
					}
					else{
						return false;
					}
			}
		else{
				if((((another.temperatureValue)/5)*9+32)<this.temperatureValue){
					return true;
				}
				else{
					return false;
				}
		}
		}
	
	public String toString(){
		
		return this.temperatureValue+"¢X"+this.temperatureScale;
		
	}
			

}
