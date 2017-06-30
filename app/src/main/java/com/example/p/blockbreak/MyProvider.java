package com.example.p.blockbreak;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/**
 * Created by P on 2017-06-30.
 */
/*
콘텐트 프로바이더(Content Provider)는 애플리케이션 간의 데이터 공유를 위해 표준화된 인터페이스를 제공하는 컴포넌트이다.
 콘텐트 프로바이더가 제공하는 실제 데이터는 파일 시스템이나 데이터베이스 등에 있을 수 있다.

콘텐트 프로바이더에는 읽기, 쓰기, 수정하기, 삭제하기 기능을 작성할 수 있으며,
 실제 코드로 살펴보면 다음과 같다. 이렇게 콘텐트 프로바이더가 구현되어 있으면
 다른 애플리케이션에서는 구현된 메소드를 호출하기만 하면 된다. */

public class MyProvider extends ContentProvider {
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }
    public String getType(Uri uri) {
        return null;
    }
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }
    public boolean onCreate() {
        return false;
    }
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        return null;
    }
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        return 0;
    }
}