package com.example.harsh.imdsensors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import java.security.Policy;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.tv);
        final TextView textView1 = findViewById(R.id.tv1);
        final EditText editText = findViewById(R.id.resultet);
        Button button = findViewById(R.id.submitbn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result = editText.getText().toString();
                editText.setText("");

                ParametersInterface parametersInterface = ApiClient.getClient().create(ParametersInterface.class);

                Call<ParamModel> call = parametersInterface.getParam("37XTK39QAO3UVTXO",result);
                call.enqueue(new Callback<ParamModel>() {
                    @Override
                    public void onResponse(Call<ParamModel> call, Response<ParamModel> response) {
                        ParamModel current = response.body();

                        Feeds feeds = current.getFeeds().get(0);

                        textView.setText(feeds.getCreated_at());
                        textView1.setText(feeds.getField1());
                    }

                    @Override
                    public void onFailure(Call<ParamModel> call, Throwable t) {

                    }
                });

            }
        });



    }
}
