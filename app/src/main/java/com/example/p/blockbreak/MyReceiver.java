package com.example.p.blockbreak;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by P on 2017-06-30.
 */
/*
브로드캐스트 리시버(Broadcast Receiver)는 특정 브로드캐스트에 반응하는 컴포넌트이며,
사용자 인터페이스를 가지고 있지 않다. 브로드캐스트에는 시간대 변경, 배터리 부족, 언어 설정 변경 등이 있으며,
 이러한 브로드캐스트를 받으면 브로드캐스트 리시버는 이를 처리하고 다시 대기 모드로 진입한다.
  또한 10초 이내의 작업만을 보증하므로 오랜 시간 동작해야 한다면 별도의 스레드로 처리하거나 서비스에 구현해야 한다.
  자바 클래스가 브로드캐스트 리시버로 동작하게 하고 싶다면 BroadcastReceiver 클래스를 상속한 다음에
   onReceive() 메소드에 원하는 기능을 작성하면 된다. */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

    }
}