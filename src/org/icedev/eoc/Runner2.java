package org.icedev.eoc;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.icedev.eoc.instructions.Instruction;
import org.icedev.eoc.instructions.InstructionsFactory;

public class Runner2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String content = "60606040526000600660006101000a81548160ff0219169083151502179055506103e860095561002d6100ca565b604051809103906000f080151561004357600080fd5b600c60006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b6100da565b604051611221806122db83390190565b6121f2806100e96000396000f3006060604052361561019f576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806325f4c703146101ab57806329dd0b86146101ce5780632f48c4aa146101f75780633806422a146102305780633f4ba83a1461025957806344bd7b711461026e5780634a23418a146102915780635216aeec146102e65780635bf5d54c1461030f5780635c975abb14610338578063649134771461036557806365e1cc851461039e57806367a3eb65146103c7578063798c6e0f146103f05780637d64bcb4146104055780638090114f1461041a5780638456cb5914610443578063845ddcb2146104585780638da5cb5b146104ab5780639075becf1461050057806399cd211d14610555578063b27b7dd1146105aa578063b4427263146105d0578063bbd46303146105da578063be9a65551461061b578063bfd2ed0114610644578063ce14a46e1461066d578063d13782a714610696578063f2fde38b146106cb578063f6a03ebf14610704578063f88a742b14610727578063fa8b72ff14610768578063fc0c546a146107a1575b5b6101a86107f6565b5b005b34156101b657600080fd5b6101cc6004808035906020019091905050610a1f565b005b34156101d957600080fd5b6101e1610aa2565b6040518082815260200191505060405180910390f35b341561020257600080fd5b61022e600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050610ba4565b005b341561023b57600080fd5b610243610c45565b6040518082815260200191505060405180910390f35b341561026457600080fd5b61026c610c53565b005b341561027957600080fd5b61028f6004808035906020019091905050610d15565b005b341561029c57600080fd5b6102a4610d98565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34156102f157600080fd5b6102f9610dbe565b6040518082815260200191505060405180910390f35b341561031a57600080fd5b610322610dc4565b6040518082815260200191505060405180910390f35b341561034357600080fd5b61034b610f2e565b604051808215151515815260200191505060405180910390f35b341561037057600080fd5b61039c600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050610f41565b005b34156103a957600080fd5b6103b1610fe2565b6040518082815260200191505060405180910390f35b34156103d257600080fd5b6103da610fe8565b6040518082815260200191505060405180910390f35b34156103fb57600080fd5b610403610fee565b005b341561041057600080fd5b6104186110e7565b005b341561042557600080fd5b61042d611605565b6040518082815260200191505060405180910390f35b341561044e57600080fd5b61045661160b565b005b341561046357600080fd5b61047960048080359060200190919050506116ce565b604051808681526020018581526020018481526020018381526020018281526020019550505050505060405180910390f35b34156104b657600080fd5b6104be611714565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561050b57600080fd5b610513611739565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561056057600080fd5b61056861175f565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34156105b557600080fd5b6105ce600480803560ff16906020019091905050611785565b005b6105d86107f6565b005b34156105e557600080fd5b610619600480803560ff16906020019091908035906020019091908035906020019091908035906020019091905050611976565b005b341561062657600080fd5b61062e611ab7565b6040518082815260200191505060405180910390f35b341561064f57600080fd5b610657611abd565b6040518082815260200191505060405180910390f35b341561067857600080fd5b610680611ac3565b6040518082815260200191505060405180910390f35b34156106a157600080fd5b6106c96004808035906020019091908035906020019091908035906020019091905050611ac9565b005b34156106d657600080fd5b610702600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050611c11565b005b341561070f57600080fd5b6107256004808035906020019091905050611ced565b005b341561073257600080fd5b610766600480803560ff16906020019091908035906020019091908035906020019091908035906020019091905050611d54565b005b341561077357600080fd5b61079f600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050611f41565b005b34156107ac57600080fd5b6107b4611fe2565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b600080600080600660009054906101000a900460ff1615151561081857600080fd5b6003546004541115151561082b57600080fd5b600060058054905011801561084257506001544210155b80156108545750610851610aa2565b42105b151561085f57600080fd5b610867610dc4565b935060058481548110151561087857fe5b906000526020600020906005020160005b509250600660019054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166108fc349081150290604051600060405180830381858888f1935050505015156108ee57600080fd5b82600201549150610922670de0b6b3a7640000610914843461200890919063ffffffff16565b61202490919063ffffffff16565b905061092c612058565b600c60009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166340c10f1933836000604051602001526040518363ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200182815260200192505050602060405180830381600087803b15156109f957600080fd5b6102c65a03f11515610a0a57600080fd5b50505060405180519050505b5b5b5b50505050565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515610a7a57600080fd5b600081118015610a8b575060095481105b1515610a9657600080fd5b80600a819055505b5b50565b600080600080600580549050111515610aba57600080fd5b6001549150600090505b600580549050811015610b9b57600581815481101515610ae057fe5b906000526020600020906005020160005b5060010154600582815481101515610b0557fe5b906000526020600020906005020160005b5060030154101515610b4e57600581815481101515610b3157fe5b906000526020600020906005020160005b50600401549150610b8d565b610b8a62015180600583815481101515610b6457fe5b906000526020600020906005020160005b506000015402836120e290919063ffffffff16565b91505b5b8080600101915050610ac4565b8192505b505090565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515610bff57600080fd5b80600760006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b5b50565b600060058054905090505b90565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515610cae57600080fd5b600660009054906101000a900460ff161515610cc957600080fd5b6000600660006101000a81548160ff0219169083151502179055507f7805862f689e2f13df9f062ff482ad3ad112aca9e0847911ed832e158c525b3360405160405180910390a15b5b5b565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515610d7057600080fd5b600081118015610d81575060095481105b1515610d8c57600080fd5b80600b819055505b5b50565b600760009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b60045481565b600080600080600580549050118015610ddf57506001544210155b8015610df15750610dee610aa2565b42105b1515610dfc57600080fd5b6001549150600090505b600580549050811015610f2357600581815481101515610e2257fe5b906000526020600020906005020160005b5060010154600582815481101515610e4757fe5b906000526020600020906005020160005b50600301541015610eed57814210158015610e9d575062015180600582815481101515610e8157fe5b906000526020600020906005020160005b506000015402820142105b15610eaa57809250610f28565b610ee662015180600583815481101515610ec057fe5b906000526020600020906005020160005b506000015402836120e290919063ffffffff16565b9150610f15565b600581815481101515610efc57fe5b906000526020600020906005020160005b506004015491505b5b8080600101915050610e06565b600192505b5b505090565b600660009054906101000a900460ff1681565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515610f9c57600080fd5b80600660016101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b5b50565b600a5481565b60035481565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561104b57600080fd5b600090505b6005805490508110156110b55760058181548110151561106c57fe5b906000526020600020906005020160005b6000820160009055600182016000905560028201600090556003820160009055600482016000905550505b8080600101915050611050565b6005805490506005818180549050039150816110d1919061211b565b50600060028190555060006003819055505b5b50565b600080600080600080600660009054906101000a900460ff1615151561110c57600080fd5b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561116757600080fd5b600c60009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166318160ddd6000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b15156111f557600080fd5b6102c65a03f1151561120657600080fd5b505050604051805190509550600a54600b540194506112448560095403611236878961202490919063ffffffff16565b61200890919063ffffffff16565b93508584019250611274600a546112666009548661200890919063ffffffff16565b61202490919063ffffffff16565b915061129f600b546112916009548661200890919063ffffffff16565b61202490919063ffffffff16565b9050600c60009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166340c10f19600760009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16846000604051602001526040518363ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200182815260200192505050602060405180830381600087803b151561139057600080fd5b6102c65a03f115156113a157600080fd5b5050506040518051905050600c60009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166340c10f19600860009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16836000604051602001526040518363ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200182815260200192505050602060405180830381600087803b151561149b57600080fd5b6102c65a03f115156114ac57600080fd5b5050506040518051905050600c60009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16637d64bcb46000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b151561154557600080fd5b6102c65a03f1151561155657600080fd5b5050506040518051905050600c60009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16639b08a22f6040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401600060405180830381600087803b15156115e657600080fd5b6102c65a03f115156115f757600080fd5b5050505b5b5b505050505050565b60095481565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561166657600080fd5b600660009054906101000a900460ff1615151561168257600080fd5b6001600660006101000a81548160ff0219169083151502179055507f6985a02210a168e66602d3235cb6db0e70f92b3ba4d376a33c0f3d9434bff62560405160405180910390a15b5b5b565b6005818154811015156116dd57fe5b906000526020600020906005020160005b915090508060000154908060010154908060020154908060030154908060040154905085565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600660019054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600860009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6000806000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156117e357600080fd5b60008360ff16101580156117fe57506005805490508360ff16105b151561180957600080fd5b60058360ff1681548110151561181b57fe5b906000526020600020906005020160005b509150611848826001015460035461210190919063ffffffff16565b600381905550611867826000015460025461210190919063ffffffff16565b60028190555060058360ff1681548110151561187f57fe5b906000526020600020906005020160005b6000820160009055600182016000905560028201600090556003820160009055600482016000905550508260ff1690505b600160058054905003811015611959576005600182018154811015156118e357fe5b906000526020600020906005020160005b5060058281548110151561190457fe5b906000526020600020906005020160005b5060008201548160000155600182015481600101556002820154816002015560038201548160030155600482015481600401559050505b80806001019150506118c1565b600580548091906001900361196e919061211b565b505b5b505050565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156119d357600080fd5b60008560ff16101580156119ee57506005805490508560ff16105b15156119f957600080fd5b60058560ff16815481101515611a0b57fe5b906000526020600020906005020160005b509050611a38816001015460035461210190919063ffffffff16565b600381905550611a57816000015460025461210190919063ffffffff16565b600281905550828160010181905550838160000181905550818160020181905550611a8d836003546120e290919063ffffffff16565b600381905550611aa8846002546120e290919063ffffffff16565b6002819055505b5b5050505050565b60015481565b600b5481565b60025481565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515611b2457600080fd5b600083118015611b345750600082115b8015611b405750600081115b1515611b4b57600080fd5b60058054806001018281611b5f919061214d565b916000526020600020906005020160005b60a06040519081016040528087815260200186815260200185815260200160008152602001600081525090919091506000820151816000015560208201518160010155604082015181600201556060820151816003015560808201518160040155505050611be9836002546120e290919063ffffffff16565b600281905550611c04826003546120e290919063ffffffff16565b6003819055505b5b505050565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515611c6c57600080fd5b600073ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff1614151515611ca857600080fd5b806000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b5b50565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515611d4857600080fd5b806001819055505b5b50565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515611db157600080fd5b6005805490508560ff16101515611dc757600080fd5b611ddc846002546120e290919063ffffffff16565b600281905550611df7836003546120e290919063ffffffff16565b60038190555060058054809190600101611e11919061211b565b5060026005805490500390505b8460ff16811115611eb257600581815481101515611e3857fe5b906000526020600020906005020160005b50600560018301815481101515611e5c57fe5b906000526020600020906005020160005b5060008201548160000155600182015481600101556002820154816002015560038201548160030155600482015481600401559050505b808060019003915050611e1e565b60a06040519081016040528085815260200184815260200183815260200160008152602001600081525060056001870160ff16815481101515611ef157fe5b906000526020600020906005020160005b5060008201518160000155602082015181600101556040820151816002015560608201518160030155608082015181600401559050505b5b5050505050565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515611f9c57600080fd5b80600860006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b5b50565b600c60009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b600080828481151561201657fe5b0490508091505b5092915050565b60008082840290506000841480612045575082848281151561204257fe5b04145b151561204d57fe5b8091505b5092915050565b600080612063610dc4565b915061207a346004546120e290919063ffffffff16565b60048190555060058281548110151561208f57fe5b906000526020600020906005020160005b5090506120ba3482600301546120e290919063ffffffff16565b8160030181905550806001015481600301541015156120dd574281600401819055505b5b5050565b60008082840190508381101515156120f657fe5b8091505b5092915050565b600082821115151561210f57fe5b81830390505b92915050565b81548183558181151161214857600502816005028360005260206000209182019101612147919061217f565b5b505050565b81548183558181151161217a57600502816005028360005260206000209182019101612179919061217f565b5b505050565b6121c391905b808211156121bf57600080820160009055600182016000905560028201600090556003820160009055600482016000905550600501612185565b5090565b905600a165627a7a72305820e6fee8dca3390b32f5576cc16c411fb45d1ba4da131d556d339f86fbeae7e9ca002960606040526000600360146101000a81548160ff0219169083151502179055506000600360156101000a81548160ff0219169083151502179055505b33600360006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b5b6111948061008d6000396000f300606060405236156100e4576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806305d2035b146100e957806306fdde0314610116578063095ea7b3146101a557806318160ddd146101ff57806323b872dd14610228578063313ce567146102a157806334fec467146102d657806340c10f191461030357806370a082311461035d5780637d64bcb4146103aa5780638da5cb5b146103d757806395d89b411461042c5780639b08a22f146104bb578063a9059cbb146104d0578063dd62ed3e1461052a578063f2fde38b14610596575b600080fd5b34156100f457600080fd5b6100fc6105cf565b604051808215151515815260200191505060405180910390f35b341561012157600080fd5b6101296105e2565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561016a5780820151818401525b60208101905061014e565b50505050905090810190601f1680156101975780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156101b057600080fd5b6101e5600480803573ffffffffffffffffffffffffffffffffffffffff1690602001909190803590602001909190505061061b565b604051808215151515815260200191505060405180910390f35b341561020a57600080fd5b6102126107a3565b6040518082815260200191505060405180910390f35b341561023357600080fd5b610287600480803573ffffffffffffffffffffffffffffffffffffffff1690602001909190803573ffffffffffffffffffffffffffffffffffffffff169060200190919080359060200190919050506107a9565b604051808215151515815260200191505060405180910390f35b34156102ac57600080fd5b6102b46107dc565b604051808263ffffffff1663ffffffff16815260200191505060405180910390f35b34156102e157600080fd5b6102e96107e1565b604051808215151515815260200191505060405180910390f35b341561030e57600080fd5b610343600480803573ffffffffffffffffffffffffffffffffffffffff169060200190919080359060200190919050506107f4565b604051808215151515815260200191505060405180910390f35b341561036857600080fd5b610394600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050610979565b6040518082815260200191505060405180910390f35b34156103b557600080fd5b6103bd6109c3565b604051808215151515815260200191505060405180910390f35b34156103e257600080fd5b6103ea610a71565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561043757600080fd5b61043f610a97565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156104805780820151818401525b602081019050610464565b50505050905090810190601f1680156104ad5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156104c657600080fd5b6104ce610ad0565b005b34156104db57600080fd5b610510600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091908035906020019091905050610b4b565b604051808215151515815260200191505060405180910390f35b341561053557600080fd5b610580600480803573ffffffffffffffffffffffffffffffffffffffff1690602001909190803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050610b7c565b6040518082815260200191505060405180910390f35b34156105a157600080fd5b6105cd600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050610c04565b005b600360149054906101000a900460ff1681565b6040805190810160405280600681526020017f466964636f6d000000000000000000000000000000000000000000000000000081525081565b6000808214806106a757506000600260003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054145b15156106b257600080fd5b81600260003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508273ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925846040518082815260200191505060405180910390a3600190505b92915050565b60005481565b6000600360159054906101000a900460ff1615156107c657600080fd5b6107d1848484610ce2565b90505b5b9392505050565b601281565b600360159054906101000a900460ff1681565b6000600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561085257600080fd5b600360149054906101000a900460ff1615151561086e57600080fd5b61088382600054610f9390919063ffffffff16565b6000819055506108db82600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054610f9390919063ffffffff16565b600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508273ffffffffffffffffffffffffffffffffffffffff167f0f6798a560793a54c3bcfe86a93cde1e73087d944c0ea20544137d4121396885836040518082815260200191505060405180910390a2600190505b5b5b92915050565b6000600160008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205490505b919050565b6000600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515610a2157600080fd5b6001600360146101000a81548160ff0219169083151502179055507fae5184fba832cb2b1f702aca6117b8d265eaf03ad33eb133f19dde0f5920fa0860405160405180910390a1600190505b5b90565b600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6040805190810160405280600381526020017f464443000000000000000000000000000000000000000000000000000000000081525081565b600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515610b2c57600080fd5b6001600360156101000a81548160ff0219169083151502179055505b5b565b6000600360159054906101000a900460ff161515610b6857600080fd5b610b728383610fb2565b90505b5b92915050565b6000600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205490505b92915050565b600360009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515610c6057600080fd5b600073ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff1614151515610c9c57600080fd5b80600360006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b5b50565b600080600260008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050610db683600160008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054610f9390919063ffffffff16565b600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002081905550610e4b83600160008873ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205461114e90919063ffffffff16565b600160008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002081905550610ea1838261114e90919063ffffffff16565b600260008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508373ffffffffffffffffffffffffffffffffffffffff168573ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef856040518082815260200191505060405180910390a3600191505b509392505050565b6000808284019050838110151515610fa757fe5b8091505b5092915050565b600061100682600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205461114e90919063ffffffff16565b600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000208190555061109b82600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054610f9390919063ffffffff16565b600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055508273ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef846040518082815260200191505060405180910390a3600190505b92915050565b600082821115151561115c57fe5b81830390505b929150505600a165627a7a723058203984bbcbd0b38871190b404d6862aa2eee0e61b5a2366c862490a140c4bcbedc0029";

		int index = 0;

		List<Instruction> instructions = new ArrayList<Instruction>();

		while (index < content.length() - 2) {
			Instruction instruction = InstructionsFactory.createInstruction(content, index);
			instructions.add(instruction);
			System.out.println(instruction);
			index = instruction.endPos();
		}
	}

}