import BarChart from "Components/BarChart";
import DataTable from "Components/DataTable";
import DonutChart from "Components/DonutChart";
import Footer from "Components/Footer";
import NavBar from "Components/NavBar";


const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">Dashboard de Vendas</h1>

                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Sucesso nas Vendas (%)</h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Todas Vendas (%)</h5>
                        <DonutChart />
                    </div>

                    <div className="py-3">
                        <h2 className="text primary"> Todas Vendas</h2>
                    </div>
                </div>
                <DataTable />
            </div>
            <Footer />
        </>
    );
}

export default Dashboard;