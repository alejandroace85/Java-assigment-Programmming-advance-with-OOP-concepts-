public class Shape {
	
	//instance fields
		private String color = "red";
		private boolean filled = true;
		
		
		
		public Shape() {
			
			color = "green";
			filled = true;
		}
		
		public Shape(String c, boolean f) {
			
			color = c;
		    filled = f;
		}

		public String getColor() {
			
			return color;
		}
		
		public void setColor(String c) {
			
			color = c;
		}
		
		public boolean isFilled() {
			
			return filled;
		}
		
		public void setFilled(boolean t) {
			
			filled = t;
		}
		public String toString() {
			String condition;
			condition = (isFilled()) ? " Filled" : " Not filled";
			System.out.print("A shape with color " + color + " and " + filled);
			return condition;
			
		
		}
	}



