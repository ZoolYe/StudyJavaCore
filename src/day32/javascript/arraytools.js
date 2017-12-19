/*
	数组获取最大值方法
*/
Array.prototype.getMax = function () {
	var temp = 0;
	for(var x = 0; x <this.length; x++){
		if(this[x] > this[temp]){
			temp = x;
		}
	}
	return this[temp];
}

/*
	数组获取最小值方法
*/
Array.prototype.getMin = function () {
	var temp = 0;
	for(var x = 0; x <this.length; x++){
		if(this[x] < this[temp]){
			temp = x;
		}
	}
	return this[temp];
}

/*
	数组的字符串表现形式，相当于java中的toString方法
*/
Array.prototype.toString = function () {
	print("[ ");
	print(this.join(""));
	print(" ]");
}