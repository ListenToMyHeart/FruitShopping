$(function () {
    load();
    console.log("Start");
 });
function load() {
    $.ajax({
        url: getContextPath() + 'student/' + requestParam("pkid") + '/info',
        type: "get",
        contentType: "application/json",
        dataType: "json",
        success: function (jsonData) {
            console.log("success");
            for (var i in jsonData) {
                if(i=="data") {
                    //三个表共用的字段
                    var name = jsonData[i].name;
                    var pkid = jsonData[i].pkid;
                    var eid = jsonData[i].eid;
                    //第一阶段数据
                    var lesssn1 = jsonData[i].lesssn1;
                    var lesssn2 = jsonData[i].lesssn2;
                    var lesssn3 = jsonData[i].lesssn3;
                    var lesssn4 = jsonData[i].lesssn4;
                    var lesssn5 = jsonData[i].lesssn5;
                    var lesssn6 = jsonData[i].lesssn6;
                    var lesssn7 = jsonData[i].lesssn7;
                    var lesssn8 = jsonData[i].lesssn8;
                    var lesssn9 = jsonData[i].lesssn9;
                    var lesssn10 = jsonData[i].lesssn10;
                    var lesssn11 = jsonData[i].lesssn11;
                    var lesssn12 = jsonData[i].lesssn12;
                    var lesssn13 = jsonData[i].lesssn13;
                    var lesssn14 = jsonData[i].lesssn14;
                    var lesssn15 = jsonData[i].lesssn15;
                    var lesssn16 = jsonData[i].lesssn16;

                    if(jsonData[i].num1==null){
                        var num1 = 0;
                    }else{
                        num1 = jsonData[i].num1;
                    }
                    if(jsonData[i].good==null){
                        var good = 0;
                    }else{
                        good = jsonData[i].good;
                    }
                    if (jsonData[i].rated1 ==null){
                        var rated1 ="";
                    }else {
                        rated1 = jsonData[i].rated1;
                    }
                    //第二阶段
                    if (jsonData[i].comment2Score ==null){
                        var comment2Score ="";
                        console.log('yes');
                    }else {
                        console.log('else');
                        comment2Score = jsonData[i].comment2Score;
                    }
                    if (jsonData[i].rated2 ==null){
                        var rated2 ="";
                    }else {
                        rated2= jsonData[i].rated2;
                    }
                    //第三阶段
                    if (jsonData[i].respon !== null){
                        var respon =jsonData[i].respon;
                    }if(jsonData[i].respon == "1"){
                        respon = "差";
                    }if(jsonData[i].respon == "0"){
                        respon = "　";
                    }

                    if( jsonData[i].initiative=="10"){
                        var initiative = "好";
                    }if(jsonData[i].initiative == "1"){
                        initiative = "差";
                    }if(jsonData[i].respon == "0"){
                        respon = "　";
                    }

                    if(jsonData[i].empress=="10"){
                        var empress ="好"
                    }if(jsonData[i].empress == "1"){
                        empress = "差";
                    }if(jsonData[i].respon == "0"){
                        respon = "　";
                    }
                    if(jsonData[i].teamsense=="10"){
                        var teamsense ="好"
                    }if(jsonData[i].teamsense == "1"){
                        teamsense = "差";
                    }if(jsonData[i].respon == "0"){
                        respon = "　";
                    }
                    if(jsonData[i].learn=="10"){
                        var learn ="好"
                        console.log(learn);
                    }if(jsonData[i].learn == "1"){
                        learn = "差";
                        console.log(learn);
                    }if(jsonData[i].respon == "0"){
                        respon = "　";
                    }
                    if(jsonData[i].comucate=="10"){
                        var comucate ="好"
                    }if(jsonData[i].comucate == "1"){
                        comucate = jsonData[i].comucate;
                    }if(jsonData[i].respon == "0"){
                        respon = "　";
                    }
                    if (jsonData[i].comment3Socre ==null){
                        var comment3Socre ="";
                    }else {
                        comment3Socre = jsonData[i].comment3Socre;
                    }
                    if (jsonData[i].rated3 ==null){
                        var rated3 ="";
                    }else {
                        rated3= jsonData[i].rated3;
                    }
                    //修改数据提示
                    if (!jsonData[i].score1 ==0){
                        alert("注意，您已经录入该数据！")
                    }

                }

            }
            $("#pkid").val(pkid);
            $("#eid").textbox("setText",eid);
            $("#name").textbox("setText",name);
            //第一阶段
            $("#lesssn1").combobox("select",lesssn1);
            console.log('aaa');
            $("#lesssn2").combobox("select",lesssn2);
            $("#lesssn3").combobox("select",lesssn3);
            $("#lesssn4").combobox("select",lesssn4);
            $("#lesssn5").combobox("select",lesssn5);
            $("#lesssn6").combobox("select",lesssn6);
            $("#lesssn7").combobox("select",lesssn7);
            $("#lesssn8").combobox("select",lesssn8);
            $("#lesssn9").combobox("select",lesssn9);
            $("#lesssn10").combobox("select",lesssn10);
            $("#lesssn11").combobox("select",lesssn11);
            $("#lesssn12").combobox("select",lesssn12);
            $("#lesssn13").combobox("select",lesssn13);
            $("#lesssn14").combobox("select",lesssn14);
            $("#lesssn15").combobox("select",lesssn15);
            $("#lesssn16").combobox("select",lesssn16);
            $("#num1").textbox("setValue",num1);
            $("#good").textbox("setValue",good);
            $("#rated1").val(rated1);
            //第二阶段
            $("#comment2_score").textbox("setValue",comment2Score);
            console.log("socre");
            console.log("score:"+comment2Score);
            $("#rated2").val(rated2);
            //第三阶段
            $("#respon").combobox("select",jsonData.data.respon);
            console.log("learn:"+jsonData.data.learn);
            $("#empress").combobox("select",jsonData.data.empress);
            $("#teamsense").combobox("select",jsonData.data.teamsense);
            $("#learn").combobox("select",jsonData.data.learn);
            $("#initiative").combobox("select",jsonData.data.initiative);
            $("#comucate").combobox("select",jsonData.data.comucate);
            $("#comment3Socre").textbox("setText",jsonData.data.comment3Socre);
            $("#rated3").val(jsonData.data.rated3);
            console.log(comment3Socre)
        },
        error: function () {
            console.log("fail");
        }
    });

}
