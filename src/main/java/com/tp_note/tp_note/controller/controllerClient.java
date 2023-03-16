@RestController
@RequestMapping("/clients")

public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/{client_id}/contrats")
    public List<Contrat> getContratsByClientId(@PathVariable(value = "client_id") Long clientId) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));

        return client.getContrats();
    }

    @GetMapping("/{client_id}/contrats/{contrat_id}")
    public Contrat getContratByIdAndClientId(@PathVariable(value = "client_id") Long clientId,
                                              @PathVariable(value = "contrat_id") Long contratId) {
        return clientRepository.findByIdAndContratId(clientId, contratId)
                .orElseThrow(() -> new ResourceNotFoundException("Contrat", "id", contratId));
    }
}