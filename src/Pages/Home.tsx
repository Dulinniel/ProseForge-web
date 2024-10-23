import { useNavigate } from "react-router-dom";

const Home = () => {

  const navigate = useNavigate();

  return (
  <>
  <main>
    <div className="flex flex-col h-screen items-center space-y-8">
      <h1 className="py-4 text-5xl font-semibold text-white">ProseForge</h1>
      <h2 className="text-white text-3xl italic">Une nouvelle plateforme</h2>
      <p className="text-gray-200 text-sm px-10 text-center">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis neque faucibus, scelerisque dolor at, pellentesque nunc. Curabitur dui ex, blandit id hendrerit vel, scelerisque non elit. Curabitur faucibus mi sit amet elit iaculis, vel convallis neque consequat. Sed augue libero, sodales id tincidunt congue, molestie quis mi. Maecenas quis felis faucibus, pellentesque mauris non, accumsan neque. Mauris nec dolor tempor, mattis justo vitae, venenatis mauris. Donec sed magna aliquam, condimentum elit ac, sagittis est. Aenean ultricies odio vitae felis interdum, eu blandit purus fermentum. Pellentesque vitae ullamcorper mauris.</p>
      <h2 className="text-white text-3xl italic">Pour écrire</h2>
      <p className="text-gray-200 text-sm px-10 text-center">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis neque faucibus, scelerisque dolor at, pellentesque nunc. Curabitur dui ex, blandit id hendrerit vel, scelerisque non elit. Curabitur faucibus mi sit amet elit iaculis, vel convallis neque consequat. Sed augue libero, sodales id tincidunt congue, molestie quis mi. Maecenas quis felis faucibus, pellentesque mauris non, accumsan neque. Mauris nec dolor tempor, mattis justo vitae, venenatis mauris. Donec sed magna aliquam, condimentum elit ac, sagittis est. Aenean ultricies odio vitae felis interdum, eu blandit purus fermentum. Pellentesque vitae ullamcorper mauris.</p>      
      <h2 className="text-white text-3xl italic">Pour partager</h2>
      <p className="text-gray-200 text-sm px-10 text-center">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis neque faucibus, scelerisque dolor at, pellentesque nunc. Curabitur dui ex, blandit id hendrerit vel, scelerisque non elit. Curabitur faucibus mi sit amet elit iaculis, vel convallis neque consequat. Sed augue libero, sodales id tincidunt congue, molestie quis mi. Maecenas quis felis faucibus, pellentesque mauris non, accumsan neque. Mauris nec dolor tempor, mattis justo vitae, venenatis mauris. Donec sed magna aliquam, condimentum elit ac, sagittis est. Aenean ultricies odio vitae felis interdum, eu blandit purus fermentum. Pellentesque vitae ullamcorper mauris.</p>
      <h2 className="text-white text-3xl italic">Pour découvrir</h2>
      <p className="text-gray-200 text-sm px-10 text-center">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi quis neque faucibus, scelerisque dolor at, pellentesque nunc. Curabitur dui ex, blandit id hendrerit vel, scelerisque non elit. Curabitur faucibus mi sit amet elit iaculis, vel convallis neque consequat. Sed augue libero, sodales id tincidunt congue, molestie quis mi. Maecenas quis felis faucibus, pellentesque mauris non, accumsan neque. Mauris nec dolor tempor, mattis justo vitae, venenatis mauris. Donec sed magna aliquam, condimentum elit ac, sagittis est. Aenean ultricies odio vitae felis interdum, eu blandit purus fermentum. Pellentesque vitae ullamcorper mauris.</p>
      <button onClick={() => navigate("/register")} type="button"
        className="py-2 px-4 shadow-md no-underline bg-transparent text-white text-sm rounded-full border-sky-400 border-2 btn-primary transition ease-in duration-300 hover:bg-sky-400 hover:text-black mr-2">
        Tournez une nouvelle page
      </button>
    </div>
  </main>
  </>
  );
}

export { Home };
