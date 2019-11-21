package ie.wspace.simpletimerapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import ie.wspace.simpletimerapp.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        //TOdo: shownotification

        PrefUtil.setTimerState(MainActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
