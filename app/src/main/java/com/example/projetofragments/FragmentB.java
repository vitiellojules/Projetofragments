package com.example.projetofragments;

import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;
        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {

    private TextView textViewMessage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        textViewMessage = view.findViewById(R.id.textViewMessage);

        return view;
    }

    // Método para atualizar a mensagem exibida no Fragmento B
    public void updateMessage(String message) {
        textViewMessage.setText(message);
    }
}
