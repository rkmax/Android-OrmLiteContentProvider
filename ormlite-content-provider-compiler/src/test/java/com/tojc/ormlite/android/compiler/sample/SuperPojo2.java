package com.tojc.ormlite.android.compiler.sample;

import android.provider.BaseColumns;
import com.j256.ormlite.field.DatabaseField;
import com.tojc.ormlite.android.annotation.AdditionalAnnotation;
import com.tojc.ormlite.android.annotation.AdditionalAnnotation.SuperContract;

@SuperContract(contractClassName = "com.tojc.ormlite.android.compiler.sample.SuperPojoContract")
public class SuperPojo2 {
    @DatabaseField(columnName = BaseColumns._ID, generatedId = true)
    @AdditionalAnnotation.DefaultSortOrder
    private int id;

    @DatabaseField
    private String name;
}
