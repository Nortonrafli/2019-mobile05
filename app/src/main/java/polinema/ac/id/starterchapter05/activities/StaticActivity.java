package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import polinema.ac.id.starterchapter05.R;

public class StaticActivity extends AppCompatActivity {

    private Object fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static);
    <fragment
        android:id="@+id/red_fragment_placeholder";
        android:name="polinema.ac.id.praktikumfragment.fragments.RedFragment";
        android:layout_width="match_parent";
        android:layout_height="match_parent";
        app:layout_constraintTop_toTopOf="parent";
        app:layout_constraintLeft_toLeftOf="parent";
        app:layout_constraintRight_toRightOf="parent";
        app:layout_constraintBottom_toBottomOf="parent" />

    }
}
