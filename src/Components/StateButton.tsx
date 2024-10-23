import { createContext, useContext, useState } from "react";

type Status = "idle" | "loading" | "success" | "error";

interface ButtonProps
{
  status: Status,
  title: string
}

type RequestState =
  | { state: 'idle' }
  | { state: 'loading' }
  | { state: 'success' }
  | { state: 'error' };

const StateButton = ({ status, title }: ButtonProps) => {
  const [ enabled, setEnabled ] = useState<RequestState>({ state: status });
  let buttonColor: string;
  switch ( enabled.state )
  {
  case "idle":
    buttonColor = "bg-indigo-600";
    break;
  case "loading":
    buttonColor = "bg-gray-600";
    break;
  case "success": 
    buttonColor = "bg-green-600";
    break;
  case "error":
    buttonColor = "bg-red-600";
    break;
  }

  const ButtonStyle: string = `${buttonColor} text-white text-sm leading-6 font-medium py-2 px-3 rounded-lg`;

  return (
    <button type="button" className={ButtonStyle}>{title}</button>
  )
}