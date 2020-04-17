public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String n = sc.next();
		char[] arr = n.toCharArray();
		ArrayList<String> res = new ArrayList<String>();
		f1(arr,0,res);
		System.out.print(res);
	}
	public static void f1(char[]arr, int k,ArrayList<String> res) {
		if(k==arr.length) {//当全部交换完成后把数组转为字符串并放入加入动态数组中
			res.add(new String(arr));
		}
		for (int i = k; i < arr.length; i++) {//一次进行交换
			swep(arr,k,i);
			f1(arr,k+1, res);//递归
			swep(arr,k,i);//回溯
		}
	}
	public static void swep(char[]arr,int n,int m) {//用于交换数的函数
		char tep = arr[n];
		arr[n] = arr[m];
		arr[m] = tep;
	}
}