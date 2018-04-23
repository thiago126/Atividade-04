package br.usjt.ads.desmob.listarpaises;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tnf98 on 18/03/2018.
 * RA 816119076
 */


public class ViewHolder {
    ImageView bandeira;
    TextView nome, detalhe;

    public ViewHolder(ImageView bandeira, TextView nome, TextView detalhe) {
        this.bandeira = bandeira;
        this.nome = nome;
        this.detalhe = detalhe;
    }

    public ImageView getBandeira() {
        return bandeira;
    }

    public void setBandeira(ImageView bandeira) {
        this.bandeira = bandeira;
    }

    public TextView getNome() {
        return nome;
    }

    public void setNome(TextView nome) {
        this.nome = nome;
    }

    public TextView getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(TextView detalhe) {
        this.detalhe = detalhe;
    }
}