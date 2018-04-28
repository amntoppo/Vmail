package com.amntoppo.root.vmail;

import android.content.Context;
import android.util.Log;

import java.util.Date;

/**
 * Created by root on 28/4/18.
 */

public class CallReceiver extends PhoneCallReceiver{
    @Override
    protected void onIncomingCallReceived(Context ctx, String number, Date start)
    {
        Log.e("Incomming", "started");
    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start)
    {
        Log.e("Incomming", "answered");
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end)
    {
        //
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start)
    {
        Log.e("Outgoing", "Started");
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end)
    {
        //
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start)
    {
        //
    }

}
