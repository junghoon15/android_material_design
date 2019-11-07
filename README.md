# android_material_design

설정
==========
mdc (Material Design Component)를 사용하기 위해 gradle에 다음과 같이 추가해준다.

<pre>implementation 'com.google.android.material:material:1.2.0-alpha01'</pre>

suffix 기능을 사용하기 위해서는 최신 1.2.0-alpha01 버전 필요.

<pre>repositories {
google()
...
}</pre>

추가로 이 라이브러리를 사용하기 위해서는 android studio의 compileSdkVersion은 최소 28 그리고 안드로이드 버전은 9이상이어야한다.


스타일
==========
기존 스타일은 AppCompat값을 받는데 mdc를 사용할것임으로 값을 변경/추가해줘야 한다.
~~~
<resources>

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.MaterialComponents.DayNight.NoActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
        <item name="textInputStyle">@style/AppOutlined</item>

        <item name="popupMenuStyle">@style/Widget.MaterialComponents.PopupMenu</item>
        <item name="android:contextPopupMenuStyle">@style/Widget.MaterialComponents.PopupMenu.ContextMenu</item>
        <item name="actionOverflowMenuStyle">@style/Widget.MaterialComponents.PopupMenu.Overflow</item>
    </style>

    <!--outlinedbox를 그리기 위한 스타일-->
    <style name="AppOutlined" parent="Widget.MaterialComponents.TextInputLayout.OutlinedBox">
        <item name="boxBackgroundColor">#ffffff</item>
    </style>

</resources>

~~~


기능
==========
1. outlinedBox

textInputLayout을 감싸는 하나의 레이아웃을 생성하기 위해 아래 코드를 추가.

~~~
<com.google.android.material.textfield.TextInputLayout

        android:layout_marginTop="20dp"
        android:layout_gravity="center"
        android:layout_width="300dp"
        android:layout_height="60dp"
        >

        <com.google.android.material.textfield.TextInputEditText
            android:hint="outlined"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            />

</com.google.android.material.textfield.TextInputLayout>
~~~

2. suffix

텍스트 레이아웃 안에 특정 단어를 맨뒤에 고정으로 두기 위한 방법

<pre>app:suffixText="단위"</pre>

3. ExposedDropdownMenu

spinner와 같은 기능을 mdc에서는 드롭다운메뉴로 구현되어있다.
아래 코드를 textinputlayout 안에 추가.
<pre>style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox.ExposedDropdownMenu"</pre>


