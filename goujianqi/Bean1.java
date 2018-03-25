package goujianqi;

public class Bean1 {
	private String a;
	private String b;
	private String c;
	private String d;
	
	//构建器
		public static class build{
			private String a;
			private String b;
			private String c;
			private String d;
			
			public build(String a,String b){
				this.a = a;
				this.b = b;
			}
			public build c(String c){
				this.c = c;
				return this;
			}
			public build d(String d){
				this.d = d;
				return this;
			}
			
			public Bean1 build1(){
				return new Bean1(this);
				
			} 
		}
		private Bean1(build build){
			a = build.a;
			b = build.b;
			c = build.c;
			d = build.d;
			
		}
}
