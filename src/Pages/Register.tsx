const Register = () => {
  return (
  <>
  <main className="flex flex-col h-screen items-center space-y-8">
  <form className="py-4">
    <fieldset className="py-4">
      <legend className="text-2xl text-white">S'inscrire</legend>
      
      <input className="text-black" type="email" id="mail"/>
      <label className="text-white" for="mail">Adresse email</label>

      <input className="text-black" type="text" id="username"/>
      <label className="text-white" for="username">Nom d'utilisateur</label>

      <input className="text-black" type="password" id="password"/>
      <label className="text-white" for="password">Mot de passe</label>
    </fieldset>    
  </form>
  </main>
  </>
  );
}

export { Register };
