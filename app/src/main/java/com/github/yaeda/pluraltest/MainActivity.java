package com.github.yaeda.pluraltest;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Resources resources = getResources();

    List<Integer> idList = Arrays.asList(R.id.plural_zero_1, R.id.plural_one_1, R.id.plural_other_1);
    for (int i = 0; i < idList.size(); i++) {
      TextView textView = findViewById(idList.get(i));
      textView.setText(resources.getQuantityString(R.plurals.has_zero, i, i));
    }

    idList = Arrays.asList(R.id.plural_zero_2, R.id.plural_one_2, R.id.plural_other_2);
    for (int i = 0; i < idList.size(); i++) {
      TextView textView = findViewById(idList.get(i));
      textView.setText(resources.getQuantityString(R.plurals.no_zero, i, i));
    }
  }
}
