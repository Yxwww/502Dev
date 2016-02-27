﻿using System;
using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Android.Glass.App;
using Android.Glass.Widget;

namespace HelloGlassWorld
{
	[Activity (Label = "Hello Xamarin", Icon = "@drawable/Icon", MainLauncher = true, Enabled = true)]
	[IntentFilter (new String[]{ "com.google.android.glass.action.VOICE_TRIGGER" })]
	[MetaData ("com.google.android.glass.VoiceTrigger", Resource = "@xml/voicetriggerstart")]
	public class MainActivity : Activity
	{
		// The project requires the Google Glass Component from
		// https://components.xamarin.com/view/googleglass
		// so make sure you add that in to compile succesfully.
		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);

            var b = new CardBuilder (this, CardBuilder.Layout.Text);
            b.SetText ("Welcome to Xamarin Google Glass Development");
            b.SetFootnote ("Let's get hacking!");
            b.SetTimestamp ("now");

            SetContentView (b.View);
		}
	}
}

