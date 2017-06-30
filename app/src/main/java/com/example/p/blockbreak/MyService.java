package com.example.p.blockbreak;

import android.app.Service;
import android.content.Intent;

/**
 * Created by P on 2017-06-30.
 */
/*
서비스(Service)는 특정 액티비티와 상관 없이 백그라운드에서 실행되는 컴포넌트이다.
그래서 화면을 구성하는 레이아웃을 작성할 필요가 없다.
이러한 이유로, 지속적으로 장시간 동작해야 하는 기능이 있다면 서비스에 구현해야 한다.
서비스로 동작하게 하고 싶다면 Service 클래스를 상속한 후,
생명주기 메소드를 재정의해서 원하는 기능을 구현하면 된다. */

/*
서비스의 생명주기는 두 가지로 분류할 수 있다. 먼저 타입 A는 로컬 서비스를 구현하는 것이고, 타입 B는 원격 서비스를 구현하는 것이다. 그래서 타입 B로 서비스를 구현할 경우, 같은 기기에서 실행되고 있는 다른 애플리케이션에서 원격 서비스로 구현된 서비스를 실행할 수 있게 된다.
        정리 Service 타입 A
        ▶ onCreate(): 서비스가 생성될 때 호출
        ▶ onStart(): startService() 메소드에 의해 서비스가 시작될 때마다 호출
        ▶ onDestory(): 서비스가 종료될 때 호출
        정리 Service 타입 B
        ▶ onCreate(): 서비스가 생성될 때 호출
        ▶ onBind(): bindService() 메소드에 의해 서비스가 시작될 때 호출
        ▶ onUnbind(): 서비스와 연결이 끊겼을 때 호출
        ▶ onDestory(): 서비스가 종료될 때 호출*/

public class MyService extends Service {
    public void onCreate() {
        Thread t = new Thread() {
            @Override
            public void run() {

            }
        };
        t.start();
    }

    public void onDestroy() {

    }
}
