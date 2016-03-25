using System;
using Xamarin.Socket.IO;
using Newtonsoft.Json.Linq;
using System.Collections.Generic;
using Newtonsoft.Json;
namespace SoD_Xamarin_AndroidLibrary
{
	public class SoD
	{
		SocketIO socket;	
		public SoD ()
		{	socket = new SocketIO ("10.13.65.16",3000);
			setup ();
		}
		private async void setup(){
			var connectionStatus = await socket.ConnectAsync ();

			if (connectionStatus == SocketIO.ConnectionStatus.Connected) {
				registerAsAndroidWatch ();
			} else {
				Console.WriteLine ("Websocket failed to connect to the server");
			}
		}
		public void test(){
			//var list = new object [] { 1, "randomString", 3.4f, new Foo () { Bar = "baz"} };
			//Foo aFoo = new Foo (){ Bar = "baz" };

		}
		public void registerAsAndroidWatch(){
			socket.Emit ("registerDevice", new Object[] {new AndroidWatch () {
					name = "Android Watch",
					deviceType = "AndroidWatch",
					width = 0.1,
					height=0.1,
					depth = 0.1,
					stationary = false
				} });
		}
	}
	[JsonObject(MemberSerialization.OptIn)]
	public class AndroidWatch: AndroidWear
	{
		[JsonProperty]
		public string name { get; set;} 
		[JsonProperty]
		public string deviceType { get; set;} 
		[JsonProperty]
		public double width { get; set;} 
		[JsonProperty]
		public double height { get; set;} 
		[JsonProperty]
		public double depth { get; set;} 
		[JsonProperty]
		public bool stationary {get;set;}
	}
	public interface AndroidWear{
		[JsonProperty]
		string name { get; set;} 
		[JsonProperty]
		string deviceType { get; set;} 
		[JsonProperty]
		double width { get; set;} 
		[JsonProperty]
		double height { get; set;} 
		[JsonProperty]
		double depth { get; set;} 
		[JsonProperty]
		bool stationary {get;set;}
	}
}

