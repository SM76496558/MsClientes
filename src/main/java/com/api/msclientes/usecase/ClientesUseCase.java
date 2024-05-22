package com.api.msclientes.usecase;

import com.api.msclientes.dto.ClienteDto;
import com.api.msclientes.model.Cliente;
import com.api.msclientes.service.IServiceCliente;
import com.api.msclientes.utils.DtoToModel;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;


import java.util.List;

import static com.api.msclientes.utils.DtoToModel.toModelCliente;

@Component
@RequiredArgsConstructor
public class ClientesUseCase {


  // El flujo seria de esta forma ->

  // Controller recibe request(puede o no recibir algun request), hace uso del ClienteUseCase.obtenerClientes() ->
  // ClienteUseCase hace uso de IServiceCliente.findAll() interface
  // (esto ejecutara el metodo correspondiente de acuerdo a donde se implemento ese interface ->
  // ServiceClienteImpl se ejecutara el metodo findAll(), que a su vez hace uso del repositoryJPA ->
  // El JPARepository retornara la lista de clientes y el flujo iria ahora de reversa, para finalizar obteniendo en el ClienteController la Lista<Cliente>


  private final IServiceCliente serviceCliente;

  public List<Cliente> obtenerClientes() {
    List<Cliente> clienteList = serviceCliente.findAll();
    // Entonces tanto aqui como en el ServiceImpl tenemos la lista de clientes
    // Aqui una ves tenemos la lista desde el serviceCLiente podemos hacer ya validaciones mas de negocio
    // Negocio nos puede decir que en su front esta diseñado para que las listas que les lleguen no sean vacias
    // entonces podemos retornarle una lista de acuerdo a sus necesidades.
    return clienteList;

  }


  // Ejemplo de caso de uso de negocio

  public List<Cliente> obtener15clientes() {
    List<Cliente> clienteList = serviceCliente.findAll();  // <-
    // El negocio pide como una HU un metodo donde solo retorne los primeros 15 clientes
    // Entonces realizamos su logica y al finalizar eso sera lo que retornemos
    return clienteList;
  }

  public Cliente saveCliente(ClienteDto clienteDto) {
    // Obtenemos el dto que nos pasa el controller, aqui podemos hacer el mapeo a la clase Cliente, de la siguiente forma ->
    Cliente clienteMapeado = toModelCliente(clienteDto);
    return serviceCliente.save(clienteMapeado);
  }


}
