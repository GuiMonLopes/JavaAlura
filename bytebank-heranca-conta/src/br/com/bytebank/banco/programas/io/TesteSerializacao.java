package br.com.bytebank.banco.programas.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.classes.Cliente;
import br.com.bytebank.banco.classes.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
        cliente.setNome("Nico");
        cliente.setProfissao("Dev");
        cliente.setCpf("234113131");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.depositar(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();

	}

}
