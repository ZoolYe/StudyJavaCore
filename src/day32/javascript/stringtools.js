/* 
    字符串对象，工具类，去除两端空格
*/
String.prototype.trim = function(){
    var start,end;
    start = 0;
    end = this.length-1;

    while (start<=end && this.charAt(start)==" ") {
        start++;
    }

    while (end>=start && this.charAt(end)==" ") {
        end--;
    }

    return this.substring(start,end+1);
}

/* 
    将字符串变成一个字符数组
*/
String.prototype.toCharArray = function(){
    //定义一个数组
    var chs = [];
    //将字符串中的每一位字符存储到字符数组中
    for(var x = 0; x<this.length; x++){
        chs[x] = this.charAt(x);
    }
    return chs;
}

/* 
    将字符串进行反转
*/
String.prototype.reverse = function(){

    //将数组位置置换功能进行封装，并定义到了反转功能内部
    function swap(chArr,x,y) {
    var temp = chArr[x];
    chArr[x] = chArr[y];
    chArr[y] = temp;
    }

    var chArr = this.toCharArray();
    for(var x = 0, y = chArr.length-1; x<y; x++,y--){
        swap(chArr,x,y);
    }
    return chArr;
}

